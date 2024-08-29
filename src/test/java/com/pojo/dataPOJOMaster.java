package com.pojo;

import java.util.Arrays;

public class dataPOJOMaster {

	private MstOem[] mst_oem;

	public dataPOJOMaster(MstOem[] mst_oem) {
		super();
		this.mst_oem = mst_oem;
	}

	public MstOem[] getMst_oem() {
		return mst_oem;
	}

	public void setMst_oem(MstOem[] mst_oem) {
		this.mst_oem = mst_oem;
	}

	@Override
	public String toString() {
		return "dataPOJOMaster [mst_oem=" + Arrays.toString(mst_oem) + "]";
	}

}
