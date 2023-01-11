package com.fullstack.controller.entiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Coupon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String CouponCode;
	@Column(name = "discount")
	private long Discount;
}
