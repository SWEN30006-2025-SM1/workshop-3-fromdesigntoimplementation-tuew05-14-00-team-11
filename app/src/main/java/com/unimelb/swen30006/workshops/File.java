package com.unimelb.swen30006.workshops;

import java.util.Date;

// Sample private file class to be replaced by your implementaiton
class File {
    private Date createdDate;
    private String fileData;
    private String fileName;

    // Missing
    private String fileType;

    public String fileType() {
        return fileType;
    }

    public int fileSize() {
        return fileData.length();
    }

    public String content() {
         return fileData;
    }
}