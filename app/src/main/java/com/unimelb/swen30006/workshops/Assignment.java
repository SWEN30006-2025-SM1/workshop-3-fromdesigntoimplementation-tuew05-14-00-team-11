package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Assignment {
    private String description;
    private Date dueDate;
    private int maxAttempts;
    private String name;

    // Missing from design model
    private ArrayList<Submission> submissions;

    private void newSubmission(Submission submission) {
        submissions.add(submission);
    }

    public Submission[] invalidSubmissions() {
        var validator = new SampleValidator();
        return submissions.stream().filter(s -> validator.validateSubmission(s) != null).toArray(Submission[]::new);
    }
}
