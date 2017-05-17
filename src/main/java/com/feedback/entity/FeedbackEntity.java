package com.feedback.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "T_FDBCK")
@Getter
@Setter
public class FeedbackEntity {

    @Id
    @Column(name = "A_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "A_FDBCK")
    String feedback;
}