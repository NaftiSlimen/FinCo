package FinCo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface IEntry {
	public void setType(EntryType type);
	public void setAmount(Double amount);
	public void setDate(LocalDateTime date);
	public EntryType getType();
	public Double getAmount();
	public LocalDateTime getDate();
	
}
