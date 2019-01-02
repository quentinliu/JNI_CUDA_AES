package com.gputest;
 
public class aesByGPU 
{
	static{
		try{
			System.loadLibrary("aescuda");
		}
		catch(UnsatisfiedLinkError e){
			System.err.println("Cannot load aescuda library\n"+e.toString());
		}
	}
	
	
        public native String testTwo(String str, String key);
	
	public static void main(String[] args){
		
		String src = "12345678901";
		String dest = "12345678901";
		String key = "123456789012345612345678901234561234567890123456";
		System.out.println("compute 1!");
		aesByGPU t = new aesByGPU();
		try{
			dest=t.testTwo(src,key);
                        System.out.println("dest:"+dest); 
		}catch (Exception e){
			e.printStackTrace();
			return;
		}
		System.out.println("compute success!");
      
	}
}

