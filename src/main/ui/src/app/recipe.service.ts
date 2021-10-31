import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Recipe } from './recipe';
import { environment } from 'src/environments/environment';

@Injectable({
    providedIn: 'root'
})

export class RecipeService{
    private apiServerUrl = environment.apiBaseUrl;

    constructor(private http: HttpClient){ }

    public getRecipes(): Observable<Recipe[]> {
        return this.http.get<Recipe[]>(`${this.apiServerUrl}/employee/all`);
    }

    public addRecipes(recipe: Recipe): Observable<Recipe> {
        return this.http.post<Recipe>(`${this.apiServerUrl}/employee/add`, recipe);
    }

    public updateRecipes(recipe: Recipe): Observable<Recipe> {
        return this.http.put<Recipe>(`${this.apiServerUrl}/employee/update`, recipe);
    }

    public deleteRecipes(recipeId: number): Observable<void> {
        return this.http.delete<void>(`${this.apiServerUrl}/employee/delete/${recipeId}`);
    }
}
