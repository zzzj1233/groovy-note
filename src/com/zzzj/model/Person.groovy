package com.zzzj.model

class Person implements Comparable<Person> {
    String name
    int age

    @Override
    int compareTo(Person o) {
        return this.age - o.age
    }

    def getAt(int i) {
        switch (i) {
            case 0: return this.name
            case 1: return this.age
        }
        throw new IllegalArgumentException("No such element $i")
    }

    def putAt(int i, def value) {
        switch (i) {
            case 0: return this.name = value
            case 1: return this.age = value
        }
        throw new IllegalArgumentException("No such element $i")
    }

    def call() {
        return this.age
    }
}
