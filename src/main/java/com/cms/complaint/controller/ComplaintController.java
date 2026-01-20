package com.cms.complaint.controller;

import com.cms.complaint.model.Complaint;
import com.cms.complaint.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ComplaintController {

    @Autowired
    private ComplaintService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("complaint", new Complaint());
        return "add-complaint";
    }

    @PostMapping("/save")
    public String saveComplaint(Complaint complaint) {
        service.saveComplaint(complaint);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("complaints", service.getAllComplaints());
        return "complaints";
    }

    @GetMapping("/resolve/{id}")
    public String resolve(@PathVariable Long id) {
        service.resolveComplaint(id);
        return "redirect:/list";
    }
}
