package com.pojo;

public class DataPOJOFDCount {
	
	 private String label; 
      private String key; 
     private int count;
     
	public DataPOJOFDCount(String label, String key, int count) {
		super();
		this.label = label;
		this.key = key;
		this.count = count;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "DataPOJOFDCount [label=" + label + ", key=" + key + ", count=" + count + "]";
	}
     
     
}
