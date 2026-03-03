# Steps:
1. Instead of modeling devices, we need to model capability, which is calibrated by behavior. 
2. So we need to first make interfaces for the different behaviors and then model devices to implement those behaviors, hence separating capability from devices.
3. After making the interfaces for different behaviors, plug the appropriate behaviors in the devices instead of the fat generic one.
4. We use java reflection and generics to pass a list of multiple class objects of all the capabilities we want. 
   - For eg, if we need projector, we'll pass a list of reflection objects/ class objects of its capabilities, InputConnectable and PowerControllable.
   - Then in the registry we'll check for the first object which is an instance of both these capabilities and return accordingly.
5. We'll refactor the classroom controller to fetch the first object using capabilities instead of device's simplename.