package com.cyclonefit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cyclone_wellbeing")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CycloneWellBeing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "activity")
	private String activity;
	
	@Column(name = "score")
	private String score;
	
	@Column(name = "image_uri")
	private String image_uri;
	
}
