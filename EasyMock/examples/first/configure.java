// setup the mock object
expect(calcMethod.calc(Position.BOSS)).andReturn(70000.0).times(2);
expect(calcMethod.calc(Position.PROGRAMMER)).andReturn(50000.0);
// Setup is finished need to activate the mock
replay(calcMethod);