package com.example.myhotel.service.impl;

import com.example.myhotel.model.Archives;
import com.example.myhotel.repository.ArchivesRepository;
import com.example.myhotel.service.IArchivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArchivesServiceImpl implements IArchivesService {

    private final ArchivesRepository archivesRepository;

    @Autowired
    public ArchivesServiceImpl(ArchivesRepository archivesRepository) {
        this.archivesRepository = archivesRepository;
    }

    @Override
    public Archives findByNumber(int numberOfArchives) {
        return archivesRepository.findByNumber(numberOfArchives);
    }

    @Override
    public List<Archives> findByID(int ID) {
        return archivesRepository.findByID(ID);
    }

    @Override
    public void changeArchivesType(int numberOfArchives, String type) {
        Archives archives = archivesRepository.findByNumber(numberOfArchives);
        archives.setType(type);
        archivesRepository.save(archives);
    }

    @Override
    public void changeArchivesID(int numberOfArchives, int archiveID) {
        Archives archives = archivesRepository.findByNumber(numberOfArchives);
        archives.setArchiveID(archiveID);
        archivesRepository.save(archives);
    }

    @Override
    public void save(Archives archive) {
        archivesRepository.save(archive);
    }

    @Override
    public List<Archives> findAll() {
        return archivesRepository.findAll();
    }

    @Override
    public void delete(Archives archive) {
        archivesRepository.delete(archive);
    }
}
