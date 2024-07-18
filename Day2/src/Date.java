
public class Date {
	private int dd,mm,yy;

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public String displayDate() {
		return this.dd+"/"+this.mm+"/"+this.yy;
		//System.out.println(this.dd+"/"+this.mm+"/"+this.yy);
	}
	
	public boolean isValidDate() {
		if(dd>0 && dd<32)
			return true;
		return false;
	}

}
