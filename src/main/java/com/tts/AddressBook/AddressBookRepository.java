package com.tts.AddressBook;


import org.apache.tomcat.jni.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressBookRepository extends CrudRepository <Address, Long> {

}
