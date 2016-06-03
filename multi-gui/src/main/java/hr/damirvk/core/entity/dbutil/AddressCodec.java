package hr.damirvk.core.entity.dbutil;


import java.nio.ByteBuffer;

import com.datastax.driver.core.ProtocolVersion;
import com.datastax.driver.core.TypeCodec;
import com.datastax.driver.core.UDTValue;
import com.datastax.driver.core.UserType;
import com.datastax.driver.core.exceptions.InvalidTypeException;
import hr.damirvk.core.entity.Address;

public class AddressCodec { 
//
//	
//	 private final TypeCodec<UDTValue> innerCodec;
//
//	    private final UserType userType;
//
//	    public AddressCodec(TypeCodec<UDTValue> innerCodec, Class<Address> javaType) {
//	        super(innerCodec.getCqlType(), javaType);
//	        this.innerCodec = innerCodec;
//	        this.userType = (UserType)innerCodec.getCqlType();
//	    }
//
//	    @Override
//	    public ByteBuffer serialize(Address value, ProtocolVersion protocolVersion) throws InvalidTypeException {
//	        return innerCodec.serialize(toUDTValue(value), protocolVersion);
//	    }
//
//	    @Override
//	    public Address deserialize(ByteBuffer bytes, ProtocolVersion protocolVersion) throws InvalidTypeException {
//	        return toAddress(innerCodec.deserialize(bytes, protocolVersion));
//	    }
//
//	    @Override
//	    public Address parse(String value) throws InvalidTypeException {
//	        return value == null || value.isEmpty() ? null : toAddress(innerCodec.parse(value));
//	    }
//
//	    @Override
//	    public String format(Address value) throws InvalidTypeException {
//	        return value == null ? null : innerCodec.format(toUDTValue(value));
//	    }
//
//	    protected Address toAddress(UDTValue value) {
//	        return value == null ? null : new Address(value.getString("country"), value.getString("city"), value.getString("street"));
//	    }
//
//	    protected UDTValue toUDTValue(Address value) {
//	    	 return value == null ? null : userType.newValue().setString("country", value.getCountry())
//	         		.setString("city", value.getCity())
//	         		.setString("street", value.getStreet());
//	    }
	
	
//    private final UserType userType;
//
//    public AddressCodec(TypeCodec<UDTValue> innerCodec, Class<Address> javaType) {
//        super(innerCodec, javaType);
//        userType = (UserType) innerCodec.getCqlType();
//    }
//
//    protected Address deserialize(UDTValue value) {
//        return value == null ? null : new Address(value.getString("country"), value.getString("city"), value.getString("street"));
//    }
//
//    protected UDTValue serialize(Address address) {
//        return address == null ? null : userType.newValue().setString("country", address.getCountry())
//        		.setString("city", address.getCity())
//        		.setString("street", address.getStreet());
//    }
}
