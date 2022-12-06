/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

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
