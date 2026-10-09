export function add(a: number, b: number): number;
export function add(a: string, b: string): string;

export function add(
    a: number | string,
    b: number | string
): number | string {
    return (a as any) + (b as any);
}


// export function add(a:number, b:number):number;
// export function add(a:string, b: string):string;

// export function add(
//     a:number | string,
//     b:number | string,
// ) : number | string 
// {
//     return (a as any) + (b as any);
// }