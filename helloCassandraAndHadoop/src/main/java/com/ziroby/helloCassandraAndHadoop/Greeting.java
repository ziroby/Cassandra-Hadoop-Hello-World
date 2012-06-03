package com.ziroby.helloCassandraAndHadoop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="greetings", schema="HelloWorld@example3")
public class Greeting {
	@Id
	private String greetingId;
	
	@Column(name="greeting_word")
	private String greetingWord;
	
	@Column(name="addressee")
	private String addressee;

	public String getGreetingId() {
		return greetingId;
	}

	public void setGreetingId(String greetingId) {
		this.greetingId = greetingId;
	}

	public String getGreetingWord() {
		return greetingWord;
	}

	public void setGreetingWord(String greetingWord) {
		this.greetingWord = greetingWord;
	}

	public String getAddressee() {
		return addressee;
	}

	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}
	
	
}
