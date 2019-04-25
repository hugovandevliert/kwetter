import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from "../../environments/environment";
import { Kweet } from "../_models/kweet";

import { User } from "../_models/user";

@Injectable({providedIn: 'root'})
export class KweetService {
  constructor(private http: HttpClient) {
  }

  getAllFromUser(userId: number) {
    return this.http.get<User[]>(`${environment.apiEndpoint}/users/${userId}/kweets`);
  }

  getByText(text: string) {
    return this.http.get<User[]>(`${environment.apiEndpoint}/kweets?text=${text}`);
  }

  delete(id: number) {
    return this.http.delete(`${environment.apiEndpoint}/users/${id}`);
  }

  create(userId: number, text: string) {
    const kweet: Kweet = new Kweet();
    kweet.text = text;

    return this.http.post(`${environment.apiEndpoint}/users/${userId}/kweets`, JSON.stringify(kweet));
  }
}
