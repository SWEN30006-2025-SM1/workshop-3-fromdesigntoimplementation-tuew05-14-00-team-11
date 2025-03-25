package com.unimelb.swen30006.workshops;

// Sample private submission class to be replaced by your implementation
class Submission {
    private int attemptNum;
    private File[] files;
    private int numFiles;

    public File[] includedFiles(){
        return files;
    }

    // Missing
    public void addFile(File file){
        files[numFiles] = file;
        numFiles++;
    }
}
