package  com.jmr.mcx.service.dto;

import com.jmr.mcx.domain.McxTransactionData;
import com.jmr.mcx.dto.StatusInfo;

public class DomesticTransferInfo extends StatusInfo{
	private String fcdbRefId;
	private String hostRefId;
	private String status;
	private String errorDetail;
	private McxTransactionData mcxTransactionData;
	private DomesticTransferDto domesticTransferDto;
	public String getFcdbRefId() {
		return fcdbRefId;
	}
	public void setFcdbRefId(String fcdbRefId) {
		this.fcdbRefId = fcdbRefId;
	}
	public String getHostRefId() {
		return hostRefId;
	}
	public void setHostRefId(String hostRefId) {
		this.hostRefId = hostRefId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorDetail() {
		return errorDetail;
	}
	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}
	public McxTransactionData getMcxTransactionData() {
		return mcxTransactionData;
	}
	public void setMcxTransactionData(McxTransactionData mcxTransactionData) {
		this.mcxTransactionData = mcxTransactionData;
	}
	public DomesticTransferDto getDomesticTransferDto() {
		return domesticTransferDto;
	}
	public void setDomesticTransferDto(DomesticTransferDto domesticTransferDto) {
		this.domesticTransferDto = domesticTransferDto;
	}
	public DomesticTransferInfo(String fcdbRefId, String hostRefId, String status,
			McxTransactionData mcxTransactionData) {
		super();
		this.fcdbRefId = fcdbRefId;
		this.hostRefId = hostRefId;
		this.status = status;
		this.mcxTransactionData = mcxTransactionData;
	}
	public DomesticTransferInfo(String errorDetail, DomesticTransferDto domesticTransferDto) {
		super();
		this.errorDetail = errorDetail;
		this.domesticTransferDto = domesticTransferDto;
	}
	public DomesticTransferInfo() {
		super();
	}
}
