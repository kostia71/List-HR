package com.dao;


import com.entities.ContactEntity;

import java.util.List;

public interface ContactDAO {
    // Добавление контакта - возвращает ID добавленного контакта
    public Long addContact(ContactEntity contact);
    // Редактирование контакта
    public void updateContact(ContactEntity contact);
    // Удаление контакта по его ID
    public void deleteContact(Long contactId);
    // Получение контакта
    public ContactEntity getContact(Long contactId);
    // Получение списка контактов
    public List<ContactEntity> findContacts();

}