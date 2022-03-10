package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.config.entities.Movie;

public class MovieDTO {
	private Long id;
	private String title;
	private Double score;
	private Integer Count;
	private String image;
	
	public MovieDTO() {
		
	}

	public MovieDTO(Long id, String title, Double score, Integer count, String image) {
		
		this.id = id;
		this.title = title;
		this.score = score;
		Count = count;
		this.image = image;
	}
	
        public MovieDTO(Movie movie) {
		
	    id = movie.getId();
		title = movie.getTitle();
		score = movie.getScore();
		Count = movie.getCount();
		image = movie.getImage();
	}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Double getScore() {
			return score;
		}

		public void setScore(Double score) {
			this.score = score;
		}

		public Integer getCount() {
			return Count;
		}

		public void setCount(Integer count) {
			Count = count;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}
        
}


