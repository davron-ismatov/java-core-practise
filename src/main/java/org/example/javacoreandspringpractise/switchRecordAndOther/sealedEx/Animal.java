package org.example.javacoreandspringpractise.switchRecordAndOther.sealedEx;

import java.io.Serializable;

public sealed interface Animal permits Animal1, Cat, Dog {
}
