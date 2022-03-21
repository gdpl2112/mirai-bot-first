package io.github.kloping.mirai0.commons.apiEntitys.qqGroupInfo;

public class Data {
	private String Groupmessage;
	private Groupleader Groupleader;
	private String Groupname;
	private String[] Grouptags;
	private String Groupbuildingtime;
	private String Groupclassification;
	private Groupadministrator[] Groupadministrator;
	private Number Groupsize;
	private String GroupIntroduction;
	private Number Grouptotal;
	private String Groupimg;
	private String Grouplinks;

	public String getGroupmessage(){
		return this.Groupmessage;
	}

	public Data setGroupmessage(String Groupmessage) {
		this.Groupmessage = Groupmessage;
		return this;
	}

	public String[] getGrouptags(){
		return this.Grouptags;
	}

	public Data setGrouptags(String[] Grouptags) {
		this.Grouptags = Grouptags;
		return this;
	}

	public String getGroupbuildingtime(){
		return this.Groupbuildingtime;
	}

	public Data setGroupbuildingtime(String Groupbuildingtime) {
		this.Groupbuildingtime = Groupbuildingtime;
		return this;
	}

	public Groupadministrator[] getGroupadministrator(){
		return this.Groupadministrator;
	}

	public Data setGroupadministrator(Groupadministrator[] Groupadministrator) {
		this.Groupadministrator = Groupadministrator;
		return this;
	}

	public String getGroupIntroduction(){
		return this.GroupIntroduction;
	}

	public Data setGroupIntroduction(String GroupIntroduction) {
		this.GroupIntroduction = GroupIntroduction;
		return this;
	}

	public Number getGrouptotal(){
		return this.Grouptotal;
	}

	public Data setGrouptotal(Number Grouptotal) {
		this.Grouptotal = Grouptotal;
		return this;
	}

	public String getGroupimg(){
		return this.Groupimg;
	}

	public Data setGroupimg(String Groupimg) {
		this.Groupimg = Groupimg;
		return this;
	}

	public String getGrouplinks(){
		return this.Grouplinks;
	}

	public Data setGrouplinks(String Grouplinks) {
		this.Grouplinks = Grouplinks;
		return this;
	}

	public Groupleader getGroupleader(){
		return this.Groupleader;
	}

	public Data setGroupleader(Groupleader Groupleader) {
		this.Groupleader = Groupleader;
		return this;
	}

	public String getGroupname(){
		return this.Groupname;
	}

	public Data setGroupname(String Groupname) {
		this.Groupname = Groupname;
		return this;
	}

	public String getGroupclassification(){
		return this.Groupclassification;
	}

	public Data setGroupclassification(String Groupclassification) {
		this.Groupclassification = Groupclassification;
		return this;
	}

	public Number getGroupsize(){
		return this.Groupsize;
	}

	public Data setGroupsize(Number Groupsize) {
		this.Groupsize = Groupsize;
		return this;
	}
}