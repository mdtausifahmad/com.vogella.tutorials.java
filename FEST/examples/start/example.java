int removed = employees.removeFired();
assertThat(removed).isZero();
 
List<Employee> newEmployees = employees.hired(TODAY);
assertThat(newEmployees).hasSize(6)
                        .contains(frodo, sam);

assertThat(yoda).isInstanceOf(Jedi.class)
                .isEqualTo(foundJedi)
                .isNotEqualTo(foundSith)