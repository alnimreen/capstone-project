package com.example.collabcode.repository;

import com.example.collabcode.model.Version;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface VersionRepository extends MongoRepository<Version, String> {
    List<Version> findByFileId(String fileId);

    void deleteByFileId(String id);

    List<Version> findByRoomId(String fileId);

    List<Version> findByRoomIdAndFileId(String roomId, String fileId);
}