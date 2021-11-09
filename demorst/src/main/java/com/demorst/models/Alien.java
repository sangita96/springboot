package com.demorst.models;

import javax.persistence.Entity;
import javax.persistence.Id;

	@Entity
	public class Alien {
		@Id
		public int aid;
		public String aname;
		public String lang;
		
		public String getAname() {
			return aname;
		}
		public void setAname(String aname) {
			this.aname = aname;
		}
		public String getLang() {
			return lang;
		}
		public void setLang(String lang) {
			this.lang = lang;
		}
		public int getAid() {
			return aid;
		}
		public void setAid(int aid) {
			this.aid = aid;
		}
		@Override
		public String toString() {
			return "Alien [aid=" + aid + ", aname=" + aname + ", lang=" + lang + "]";
		}
		

	}

