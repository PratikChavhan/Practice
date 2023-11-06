package com.org.demo.dao;

import com.org.demo.beans.Person;

public class PersonDaoImpl implements PersonDao {

    static Person[] parr;
    static int cnt;

    static{
        parr = new Person[100];
        parr[0] = new Person(1, "A B C", "4654686464");
        parr[1] = new Person(2, "D E F", "7871646312");
        parr[2] = new Person(3, "G H I", "8464897987");
        parr[3] = new Person(4, "J K L", "9817464644");
        parr[4] = new Person(5, "M N O", "9849541654");
        cnt = 5;
    }

    @Override
    public void save(Person p) {
       parr[cnt] = p; 
       cnt++;
    }

	@Override
	public Person[] findall() {
		return parr;
	}

	@Override
	public Person findByID(int id) {
		for(int i=0; i<cnt; i++) {
			if (parr[i] != null) {	
				if (id == parr[i].getPid()) {
					return parr[i];
				}
			}
			else
				break;
		}
		return null;
	}

	@Override
	public String removeID(int i) {
		for (int j=0; j<cnt; j++) {
			if (parr[j].getPid() == i) {
				parr[j] = null;
				for(int k = j; k < cnt-1; k++) {
					parr[k] = parr[k+1];
				}
				parr[cnt-1] = null;
				cnt--;
				return "ID deleted successfully";
			}
		}
		return null;
	}
}
