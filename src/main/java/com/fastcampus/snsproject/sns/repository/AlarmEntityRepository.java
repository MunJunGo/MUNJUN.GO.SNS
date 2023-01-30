package com.fastcampus.sns.repository;

import com.fastcampus.sns.model.entity.AlarmEntity;
import com.fastcampus.sns.model.entity.LikeEntity;
import com.fastcampus.sns.model.entity.PostEntity;
import com.fastcampus.sns.model.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlarmEntityRepository extends JpaRepository<AlarmEntity, Integer> {

    Page<AlarmEntity> findAllByUser(UserEntity user, Pageable pageable);

    //@Query(value = "SELECT * FROM AlarmEntity entity WHERE entity.user_id = :userId")
    Page<AlarmEntity> findAllByUserId(Integer userId, Pageable pageable);
}
