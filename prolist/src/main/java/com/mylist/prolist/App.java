package com.mylist.prolist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        List<Integer> list = new List<>();
        list.add(23);
        list.add(25);
        list.add(99);
        LOGGER.debug(list);
        list.remove(2);
        LOGGER.debug(list);
        LOGGER.debug(list.get(0) );
        LOGGER.debug(list.get(1) );
        LOGGER.debug(list.size());
        List<String>list2=new List<>();
        list2.add("Hi ");
        list2.add("Epam");
        list2.add("Students");
        list2.add("Olla");
        LOGGER.debug(list2);
        LOGGER.debug(list.get(0));
        LOGGER.debug(list2.size());
        list2.remove(2);
        LOGGER.debug(list2);
    }
}
