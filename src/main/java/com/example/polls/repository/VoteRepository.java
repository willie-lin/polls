package com.example.polls.repository;

import com.example.polls.models.Choice;
import com.example.polls.models.ChoiceVoteCount;
import com.example.polls.models.Poll;
import com.example.polls.models.Vote;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.repository
 * User: YuAn
 * Date: 2018/6/25
 * Time: 21:38
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {

    @Query("SELECT NEW com.example.polls.models.ChoiceVoteCount(v.choice.id, count(v.id)) FROM Vote v WHERE v.poll.id in :pollIds GROUP BY v.choice.id")
    List<ChoiceVoteCount> countByPollIdInGroupByChoiceId(@Param("pollIds") List<Long> pollIds);

    @Query("SELECT NEW com.example.polls.models.ChoiceVoteCount(v.choice.id, count(v.id)) FROM Vote v WHERE v.poll.id = :pollId GROUP BY v.choice.id")
    List<ChoiceVoteCount> countByPollIdGroupByChoiceId(@Param("pollId") Long pollId);


    @Query("SELECT v FROM Vote v WHERE v.user.id = :userId and v.poll.id = :pollIds")
    List<Vote> findByUserIdAndPollIdIn(@Param("userId") Long userId,@Param("pollId") List<Long> pollIds);

    @Query("SELECT v FROM Vote v WHERE v.user.id = :userId and v.poll.id = :pollId")
    List<Vote> findByUserIdAndPollId(@Param("userId") Long userId,@Param("pollId") Long pollId);


    @Query("SELECT COUNT(v.id) FROM Vote v WHERE v.user.id = :userId")
    long countByUserId(@Param("userId") Long userId);

    @Query("SELECT v.poll.id FROM Vote v WHERE v.user.id = :userId")
    Page<Long> findVotedPollIdsByUserId(@Param("userId") Long userId, Pageable pageable);

}
