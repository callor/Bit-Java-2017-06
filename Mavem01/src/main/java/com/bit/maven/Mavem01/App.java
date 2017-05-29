package com.bit.maven.Mavem01;

public class App 
{
    public static void main( String[] args )
    {

    	String sql = " SELECT sadate,satime,sabucode, buname FROM sales " 
    					+ " LEFT JOIN buyer "
    					+ " ON sales.sabucode = buyer.bucode ; ";
    	
    	System.out.println(sql);
//    	for(int i = 0 ; i < 100; i++){
////    		String[] a = new String[1];
//    		
//    		Sales.main(new String[1]);
//    		
//    	}

    }
}
