# Solidity
- Compiled
- Statically typed
- Object Oriented

Invented in 2014, commonly associated with ETH.
files end in .sol
pragma enables compiler features

```solidity
pragma solidity ^0.8.6;

// similar to a class
contract MyContract {

    // can define state or variables
    string public hello_world = "Hello, world!";

    // Special datatype, holds a 20 byte ETH address
    address payable public seller;
    address payable public buyer;

    // custom datatype
    struct Order {
        string description;
    }

    // function
    function confirmOrder() public {
        buyer = payable(msg.sender);
    }

    // called when contract is created
    constructor(string memory _text) {
        hello_world = _text;
    }

}
```
