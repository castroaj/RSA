# RSA

Simple Java RSA implementation. Allows for encryption of any given byte array. Allows user to then decrypt that byte array using the RSA object itself. Also allows user to easliy aq

Designed for the Reciever to use RSA(int bitLen) constructor to create an instance of the object and then send the public key to the out to whoever wants to send encrypted data to them.

The Sender would then use the RSA(BigInteger e, BigInteger n) constructor to create an instance of the RSA object. They can then encrypt any given byte array and send it to the Reciever. 

When the Reciever actually recieves the encrypted byte array, they can then decrypt it using the same instance of the RSA object that they created when they sent out the public key.
