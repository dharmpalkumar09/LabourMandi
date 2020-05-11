package com.app.navinbharat.model;

import com.app.navinbharat.enums.Idtype;

import java.sql.Blob;

public class IdProof {
    private Idtype idType;
    private String idNumber;
    private Blob idDoc;

    @Override
    public String toString() {
        return "IdProof{" +
                "idType=" + idType +
                ", idNumber='" + idNumber + '\'' +
                ", idDoc=" + idDoc +
                '}';
    }

    public Idtype getIdType() {
        return idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public Blob getIdDoc() {
        return idDoc;
    }
}
