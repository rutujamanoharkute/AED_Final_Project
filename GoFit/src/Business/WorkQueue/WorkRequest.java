/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Harshada
 */
public class WorkRequest {

    private String workMessage;
    private String workStatus;
    private Date workRequestDate;
    private Date workResolvedDate;
       private UserAccount userAccountRequested;
    private UserAccount receiver;
    private String status;

    public UserAccount getUserAccountRequested() {
        return userAccountRequested;
    }

    public void setUserAccountRequested(UserAccount userAccountRequested) {
        this.userAccountRequested = userAccountRequested;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

}
