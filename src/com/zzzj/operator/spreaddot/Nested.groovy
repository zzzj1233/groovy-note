import com.zzzj.model.Master
import com.zzzj.model.Person

def masters = [
        new Master(name: "zzzj", slaver: [new Person(name: "dl"), new Person(name: "@")]),
        new Master(name: "abc", slaver: [new Person(name: "efg"), new Person(name: "hjk")])
]


def names = masters*.slaver*.name

assert names == [["dl", "@"], ["efg", "hjk"]]

assert names.sum() == ["dl", "@", "efg", "hjk"]

assert names.sum() == names.flatten()