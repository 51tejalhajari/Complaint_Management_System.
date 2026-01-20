package com.cms.complaint.service;

import com.cms.complaint.model.Complaint;
import com.cms.complaint.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintService {

    @Autowired
    private ComplaintRepository repo;

    public void saveComplaint(Complaint complaint) {
        repo.save(complaint);
    }

    public List<Complaint> getAllComplaints() {
        return repo.findAll();
    }

    public void resolveComplaint(Long id) {
        Complaint c = repo.findById(id).get();
        c.setStatus("RESOLVED");
        repo.save(c);
    }
}
