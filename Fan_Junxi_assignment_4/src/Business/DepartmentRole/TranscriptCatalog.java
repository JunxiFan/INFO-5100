/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DepartmentRole;


import java.util.ArrayList;

/**
 *
 * @author fjx19
 */
public class TranscriptCatalog {

    private ArrayList<Transcript> transcriptCatalog;

    public TranscriptCatalog() {
        transcriptCatalog = new ArrayList<Transcript>();
    }

    public ArrayList<Transcript> getTranscriptCatalog() {
        return transcriptCatalog;
    }

    public Transcript addTranscript() {
        Transcript transcript = new Transcript();
        transcriptCatalog.add(transcript);
        return transcript;
    }
}
