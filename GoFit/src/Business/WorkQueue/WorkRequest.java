/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Harshada
 */
public class WorkRequest {

    private String workMessage;
    private String workStatus;
    private Date workRequestDate;
    private Date workResolvedDate;
    private UserAccount sender;
    private UserAccount receiver;
    private int RequestID;
    
     public WorkRequest(){
        workRequestDate = new Date();
        Random r = new Random();
        RequestID = r.nextInt();
    }

    public int getRequestID() {
        return RequestID;
    }

    public void setRequestID(int RequestID) {
        this.RequestID = RequestID;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getWorkMessage() {
        return workMessage;
    }

    public void setWorkMessage(String workMessage) {
        this.workMessage = workMessage;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public Date getWorkRequestDate() {
        return workRequestDate;
    }

    public void setWorkRequestDate(Date workRequestDate) {
        this.workRequestDate = workRequestDate;
    }

    public Date getWorkResolvedDate() {
        return workResolvedDate;
    }

    public void setWorkResolvedDate(Date workResolvedDate) {
        this.workResolvedDate = workResolvedDate;
    }
     @Override
    public String toString() {
        return workMessage;
    }

}
