package com.hotel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



@Entity
@Table(name="hotels")
public class Hotel {
	@Id
	@Column(name = "HotelId")
	private String hotelId;
	
	@Column(name = "HotelName")
	private String hotelName;
	
	@Column(name = "HotelLoc")
	private String location;
	
	@Column(name = "About")
	private String about;
}
