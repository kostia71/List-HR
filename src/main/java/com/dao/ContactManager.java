package com.dao;

import com.entities.ContactEntity;

import java.util.List;

public class ContactManager {
    private ContactDAO dao;

    public ContactManager() {
        dao = ContactDAOFactory.getContactDAO();
    }

    // Добавление контакта - возвращает ID добавленного контакта
    public Long addContact(ContactEntity contact) {
        return dao.addContact(contact);
    }

    // Редактирование контакта
    public void updateContact(ContactEntity contact) {
        dao.updateContact(contact);
    }

    // Удаление контакта по его ID
    public void deleteContact(Long contactId) {
        dao.deleteContact(contactId);
    }

    // Получение одного контакта
    public ContactEntity getContact(Long contactId) {
        return dao.getContact(contactId);
    }

    // Получение списка контактов
    public List<ContactEntity> findContacts() {
        return dao.findContacts();
    }
}