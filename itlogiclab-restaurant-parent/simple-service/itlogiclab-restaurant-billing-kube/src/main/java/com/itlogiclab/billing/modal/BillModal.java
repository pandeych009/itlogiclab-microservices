package com.itlogiclab.billing.modal;

import java.util.List;

public class BillModal {
	
	private long billId; 
	private long customerId; 
	private String invoiceNo;
	private float billAmount; 
	private String date;
	private long orderId; 
	private long amount;
	private String status;
	
	private List<BillInfoModal> billInfoList;
	
	/**
	 * @return the billId
	 */
	public long getBillId() {
		return billId;
	}
	/**
	 * @param billId the billId to set
	 */
	public void setBillId(long billId) {
		this.billId = billId;
	}
	/**
	 * @return the customerId
	 */
	public long getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the invoiceNo
	 */
	public String getInvoiceNo() {
		return invoiceNo;
	}
	/**
	 * @param invoiceNo the invoiceNo to set
	 */
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	/**
	 * @return the billAmount
	 */
	public float getBillAmount() {
		return billAmount;
	}
	/**
	 * @param billAmount the billAmount to set
	 */
	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the orderId
	 */
	public long getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the amount
	 */
	public long getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(long amount) {
		this.amount = amount;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * @return the billInfoList
	 */
	public List<BillInfoModal> getBillInfoList() {
		return billInfoList;
	}
	/**
	 * @param billInfoList the billInfoList to set
	 */
	public void setBillInfoList(List<BillInfoModal> billInfoList) {
		this.billInfoList = billInfoList;
	}
	@Override
	public String toString() {
		return "BillModal [billId=" + billId + ", customerId=" + customerId + ", invoiceNo=" + invoiceNo
				+ ", billAmount=" + billAmount + ", date=" + date + ", orderId=" + orderId + ", amount=" + amount
				+ ", status=" + status + "]";
	} 
	
}
