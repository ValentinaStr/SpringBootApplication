package com.example.ec.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import java.util.Objects;

@Entity
public class TourRating {
    @EmbeddedId
    private TourRatingPk pk;

    @Column(nullable = false)
    private Integer score;

    @Column
    private String comment;

    public TourRating(final TourRatingPk pk, final Integer score, final String comment) {
        this.pk = pk;
        this.score = score;
        this.comment = comment;
    }

    private TourRating() {
    }

    @Override
    public String toString() {
        return "TourRating{" +
                "pk=" + pk +
                ", score=" + score +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (null == o || this.getClass() != o.getClass()) return false;
        final TourRating that = (TourRating) o;
        return Objects.equals(this.pk, that.pk) &&
                Objects.equals(this.score, that.score) &&
                Objects.equals(this.comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.pk, this.score, this.comment);
    }

    public TourRatingPk getPk() {
        return this.pk;
    }

    public void setPk(final TourRatingPk pk) {
        this.pk = pk;
    }

    public Integer getScore() {
        return this.score;
    }

    public void setScore(final Integer score) {
        this.score = score;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }
}
