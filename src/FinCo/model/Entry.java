package FinCo.model;

import java.time.LocalDateTime;

public class Entry implements IEntry {
	private EntryType type;
	private Double amount;
	private LocalDateTime date;
	public Entry(EntryType type,Double amount,LocalDateTime date) {
		this.type=type;
		this.amount=amount;
		this.date=date;
	}
	@Override	
	public EntryType getType() {
		return type;
	}
	@Override
	public Double getAmount() {
		return amount;
	}
	@Override
	public LocalDateTime getDate() {
		return date;
	}


	@Override
	public void setType(EntryType type) {
		this.type=type;
	}

	@Override
	public void setAmount(Double amount) {
		this.amount=amount;
	}

	@Override
	public void setDate(LocalDateTime date) {
		this.date=date;
	}


}
