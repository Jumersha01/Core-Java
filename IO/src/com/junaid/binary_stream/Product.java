package com.junaid.binary_stream;

import java.io.Serializable;

public record Product(Integer id,String name,Double price) implements Serializable {

}
