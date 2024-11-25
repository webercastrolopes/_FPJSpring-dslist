package com.liparts.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

	
		@EmbeddedId
		private BelongingPK id = new BelongingPK();
		
		private Integer position;

		public BelongingPK getId() {
			return id;
		}

		public void setId(BelongingPK id) {
			this.id = id;
		}

		public Integer getPosition() {
			return position;
		}

		public void setPosition(Integer position) {
			this.position = position;
		}

		
		
		
	
		
}
