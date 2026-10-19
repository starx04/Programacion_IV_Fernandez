interface PartcipanteTorneo {
    nombre: string;
    nivelPoder: number;
    presentartecnica(): void;
    transformarse(): void;
}

class Goku implements PartcipanteTorneo {
    nombre = "Goku";
    nivelPoder = 9000;
    presentartecnica(): void {
        console.log("Goku utiliza kamekameha")
    };
    transformarse(): void {
        console.log("Goku se tranforma en super sayayin")
    }
}

class Vegeta implements PartcipanteTorneo {
    nombre = "Vegeta";
    nivelPoder = 8000;
    presentartecnica(): void {
        console.log("Vegeta utiliza el final flash")
    };
    transformarse(): void {
        console.log("Vegeta se tranforma en super sayayin 2")
    }
}
const goku = new Goku();
const vegeta = new Vegeta();

goku.presentartecnica();
vegeta.presentartecnica();


