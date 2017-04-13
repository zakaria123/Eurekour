package com.eurekour.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Client_Pack {
	@Id
    private Long idClientPack;
	@ManyToOne
	@JoinColumn(name="id_pack",referencedColumnName="idPack")
	private Pack pack;
	@ManyToOne
	private Client client;
	public Client_Pack() {
		super();
	}
	public Client_Pack(Pack pack, Client client) {
		super();
		this.pack = pack;
		this.client = client;
	}
	public Long getIdClientPack() {
		return idClientPack;
	}
	public void setIdClientPack(Long idClientPack) {
		this.idClientPack = idClientPack;
	}
	public Pack getPack() {
		return pack;
	}
	public void setPack(Pack pack) {
		this.pack = pack;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
}
